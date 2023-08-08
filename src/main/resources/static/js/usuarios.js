// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarUsuarios();
  $('#usuarios').DataTable();
});

async function cargarUsuarios(){
    const url = "/user/allUsers";
    const request = await fetch(url,{
        method:'GET',
        headers:{
            'Accept':'application/json',
            'Content-type':'application/json'
        }//,
        //body: JSON.stringify({data})
    });
    const usersContent = await request.json();
    //console.log(usersContent);
    // request.map(user =>{
    //     return document.querySelector('#usuarios tbody').innerText = `<tr> <th>ID</th> <th>${user.nombre} ${user.apellidos}</th>    <th>${user.telefono}</th>  <th>${user.email}</th>   <th>${user.edad}</th>   <th>${user.direccion}</th>  <th>Acciones</th>   </tr>`;
    // });
    for(let usuario of usersContent) {
        let usuariosHTML = '<tr> <th>ID</th> <th>'+usuario.nombre+' '+usuario.apellido+'</th>    <th>'+usuario.telefono+'/th>  <th>'++usuario.'/'+>   <th>${usuaridad}<+'t'+   <th>${usuariorecc+'o'+</th>  <th>Accio</th>   </tr>';
    }
    //document.querySelector('#usuarios tbody').innerText = `<tr> <th>ID</th> <th>Nombre Completo</th>    <th>EMail</th>  <th>Teléfono</th>   <th>Edad</th>   <th>Dirección</th>  <th>Acciones</th>   </tr>`;
}