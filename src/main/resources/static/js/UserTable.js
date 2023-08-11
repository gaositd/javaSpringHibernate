// Call the dataTables jQuery plugin
$(document).ready(function() {
  loadUsersTable()
  $('#usersData').DataTable();
});

const getHeaders = () => {
  return {
    'Accept': 'application/json',
    'Content-Type': 'application/json',
    'Authorization': localStorage.token,
  }
};

async function loadUsersTable() {

  const urlApi = "/user/allUsers";
    const requestUser = await fetch(urlApi,{
      method:'GET',
      headers:getHeaders()
    });
    const UserList = await requestUser.json();

    let userHTML = '';
    let listHTML = '';
    for(const oneUser of UserList){
      const btnDelete = `<a href='#' onclick='deleteUser(${oneUser.id})' class='btn btn-danger btn-circle btn-sm'> <i class='fas fa-trash' title="Delete"></i> </a>`;
      const btnUpdate = `<a href='register.html?id=${oneUser.id}' class='btn btn-success btn-circle btn-sm'> <i class="fas fa-edit"  title="Update"></i> </a>`;
      userHTML = `<tr id=${oneUser.id}> <td>${oneUser.id}</td> <td>${oneUser.names} ${oneUser.lastNames}</td> <td>${oneUser.age}</td> <td>${oneUser.email}</td> <td>${oneUser.phoneNumber}</td> <td>${oneUser.address}</td> <td> ${btnDelete} ${btnUpdate}</td> </tr>`;
      listHTML += userHTML;
    }

    document.querySelector("#usersData tbody").outerHTML = listHTML;
    document.getElementById("userMail").innerHTML = localStorage.email;
}

async function deleteUser(id){
  
  const urlApi = `/user/oneUser/${id}`;
  if(!confirm("Are you sure you want to delete user?")){
    return;
  }
  try {
    const requestUser = await fetch(urlApi,{
      method:'DELETE',
      headers: getHeaders(),
      
    })}catch(err){
      console.error(err);
    };
    location.reload();
}