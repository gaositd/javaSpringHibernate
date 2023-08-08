// Call the dataTables jQuery plugin
$(document).ready(function() {
  loadUsersTable()
  $('#usersData').DataTable();
});


async function loadUsersTable() {
  //const urlApi = "https://jsonplaceholder.typicode.com/users";
  //const urlApi = "/user/oneUser/1";//solo toma un usuario por ID
  const urlApi = "/user/allUsers";
    const requestUser = await fetch(urlApi,{
      method:'GET',
      headers:{
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }/*,
      body: JSON.stringify(requestUser), se usa en post y cosas de esas*/
    });
    const UserList = await requestUser.json();
    let userHTML = '';
    let listHTML = '';
    for(const oneUser of UserList){
      userHTML = `<tr id=${oneUser.id}> <td>${oneUser.id}</td> <td>${oneUser.name} ${oneUser.lastNames}</td> <td>${oneUser.age}</td> <td>${oneUser.phoneNumber}</td> <td>${oneUser.address}</td> <td> <a href='#' class='btn btn-danger btn-circle btn-sm'> <i class='fas fa-trash' title="Delete"></i> </a> </td> </tr>`;
      listHTML += userHTML;
    }

    document.querySelector("#usersData tbody").outerHTML = listHTML;
}