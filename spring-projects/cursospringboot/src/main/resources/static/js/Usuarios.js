const $tbody = document.querySelector("#dataTable > tbody");

function getUser(){
    fetch("http://localhost:8080/usuarios/1")
    .then(response => response.ok ? response.json() : Promise.reject(response))
    .then(json =>{
        $tbody.innerHTML = `
        <tr>
            <td>${json.name}</td>
            <td>${json.lastname}</td>
            <td>${json.phone}</td>
            <td>${json.email}</td>
            <td>${json.password}</td>
        <td>
            <a href="#" class="btn btn-danger btn-circle"><i class="fas fa-trash"></i></a>
            <a href="#" class="btn btn-info btn-circle "><i class="fas fa-info-circle"></i></a>
            </td>
        </tr>
        `
        console.log(json);
    })
    .catch(error =>{
        console.error(error);
    })
}

function getUsers(){
    fetch("http://localhost:8080/usuarios")
    .then(response => response.ok ? response.json() : Promise.reject(response))
    .then(json =>{
        let template = "";
        json.forEach(user => {
            template += `
            <tr>
                <td>${user.name}</td>
                <td>${user.lastname}</td>
                <td>${user.phone}</td>
                <td>${user.email}</td>
                <td>${user.password}</td>
            <td>
                <a href="#" class="btn btn-danger btn-circle"><i class="fas fa-trash"></i></a>
                <a href="#" class="btn btn-info btn-circle "><i class="fas fa-info-circle"></i></a>
                </td>
            </tr>
            `
        });
        $tbody.innerHTML = template;
        console.log(json);
    })
    .catch(error =>{
        console.error(error);
    })
}

getUsers();
