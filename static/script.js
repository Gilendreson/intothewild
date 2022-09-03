/* abre e fecha o menu lateral em modo mobile*/

const menuMobile = document.querySelector(".menu-mobile");
const body = document.querySelector("body");

menuMobile.addEventListener("click", () =>{
    menuMobile.classList.contains("bi-list")
    ? menuMobile.classList.replace("bi-list","bi-x")
    : menuMobile.classList.replace("bi-x", "bi-list");
   body.classList.toggle("menu-nav-active");
})

/*fecha o menu quando clica no navitem */

const navItem = document.querySelectorAll('.nav-item')

navItem.forEach(item => {
    item.addEventListener("click", () =>{
        if (body.classList.contains("menu-nav-active")) {
            body.classList.remove("menu-nav-active")
            menuMobile.classList.replace("bi-x", "bi-list");
        }
    })
});

/* efeitos de animação [data-anime] */
const item = document.querySelectorAll("[data-anime]");
    const animeScroll = () => {
        const windowTop = window.pageYOffset + window.innerHeight * 0.85 ;

        item.forEach((Element) => {
            if (windowTop > Element.offsetTop) {
                Element.classList.add("animate");
            } else {
                    Element.classList.remove("animate");
                }

        });           
    };
    

animeScroll();

window.addEventListener("scroll", ()=>{
    animeScroll();
});





/* Mensagem de envio*/

function enviar(){
    alert("Recebemos sua mensagem, em breve retornaremos o contato. Obrigado!");
}

window.onload = function(){
    var btn = document.getElementById("btn-submit");

    btn.onclick = enviar;
};


/* Mensagem de cadastro com sucesso */

function cadastrar(){
    alert("Cadastro realizado com sucesso, verifique seu email!");
}

window.onload = function(){
    var btn2 = document.getElementById("btn-cadastrar");

    btn2.onclick = cadastrar;
}

