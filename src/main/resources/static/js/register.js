// Call the dataTables jQuery plugin
// $(document).ready(function () {
//   checkPassword();
// });
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
        "Content-Type": "application/json",
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
