const getHeaders = () => {
  return {
    'Accept': 'application/json',
    'Content-Type': 'application/json',
    'Authorization': localStorage.token,
  }
};

const createfakeId = (max) => { 
  return Math.floor(Math.random() * max);
};

function checkPassword(){
  const pass1 = document.getElementById('InputPassword').value;
  const pass2 = document.getElementById('RepeatPassword').value;

  if(pass1.length > 0 && pass2.length > 0){
    pass1 === pass2 ? registerUsers() : alert('Passwords do not match, please check your passwords'); /*event.preventDefault()*/;
  }
}

async function registerUsers() {
  const urlApi = "/user/registerUser";
  let data = {};

  data.id= createfakeId(32000);
  data.names = document.getElementById("FirstName").value;
  data.lastNames = document.getElementById("LastName").value;
  data.email = document.getElementById("Email").value;
  data.address = document.getElementById("address").value;
  data.age = document.getElementById("age").value;
  data.phoneNumber = document.getElementById("telephone").value;
  data.password = document.getElementById("InputPassword").value;

  try {
    const requestUser = await fetch(urlApi, {
      method: "POST",
      headers: {
        Accept: "application/json",
        "Content-Type": "application/json"
      },
      body: JSON.stringify(data), //se usa en post y cosas de esas
    });
  }catch (err) {
    alert(`Error:  ${err.message}`);
    return;
  }
  alert("The account has been created successfully");
  location.href = "users.html";
}

async function getUser(parameter){
  const urlParams = new URLSearchParams(parameter);
  const id = urlParams.get('id');
  const urlApi = `/users/getUser/${id}`;
  let requestGetUser = {};
  console.log(urlApi);

  try{
    requestGetUser = await fetch(urlApi,{
      method: 'GET',
      headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
      }
    });
    data = await requestGetUser.json(); // Obtener los datos de la respuesta como JSON
  }catch(err){
    alert(`Error: ${err.message}`);
  }

  document.getElementById('FirstName').value = data.names;
  document.getElementById('LastName').value = data.lastNames;
  document.getElementById('Email').value = data.email;
  document.getElementById('address').value = data.address;
  document.getElementById('age').value = data.age;
  document.getElementById('telephone').value = data.phoneNumber;

}

async function updateUser(data) {
  const urlApi = `/user/updateUser/${encodeURIComponent(data)}`; // Cambiado el URL para usar el valor directamente
  console.log(urlApi);
  const id = data.id;
  data = {};
  data.id = id;
  data.names = document.getElementById('FirstName').value;
  data.lastNames = document.getElementById('LastName').value;
  data.email = document.getElementById('Email').value;
  data.address = document.getElementById('address').value;
  data.age = document.getElementById('age').value;
  data.phoneNumber = document.getElementById('telephone').value;

  try {
    const response = await fetch(urlApi, {
      method: 'PUT',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': localStorage.token,
      },
      body: JSON.stringify(data),
    });

    if (response.ok) {
      const responseData = await response.json();
      window.location.href = "../users.html";
    } else {
      const errorData = await response.json();
      alert(`Error en la solicitud: ${errorData}`);
    }
  } catch (err) {
    alert(`Error: ${err.message}`);
  }
}