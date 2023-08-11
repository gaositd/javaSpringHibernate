async function startSession() {
  const urlApi = "/user/login";
  let data = {};

  data.email = document.getElementById("InputEmail").value;
  data.password = document.getElementById("InputPassword").value;

  if(data.email.length === 0 && data.email === 0){
    alert("Please enter a email and/or password");
    return;

  }

  let requestUser;
  try {
    requestUser = await fetch(urlApi, {
      method: "POST",
      headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
      },
      body: JSON.stringify(data), //se usa en post y cosas de esas
    });
  }catch (err) {
    console.error(`Error:  ${err.message}`);
    return;
  }
  // location.href = "users.html";
  // const response = await requestUser.json();
  const response = await requestUser.text();
  console.log(response);
  if(response !== 'FAIL'){
    localStorage.token = response;
    localStorage.email = data.email;
    window.location.href = "users.html";
  }else{
    alert("check your credentials and try again");
  }
}
