let currentSlide = 0;

function showSlide(n) {
    const slides = document.getElementsByClassName("slide");

    if (n >= slides.length) {
        currentSlide = 0;
    }

    if (n < 0) {
        currentSlide = slides.length - 1;
    }

    for (let i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
    }

    slides[currentSlide].style.display = "block";
}

function nextSlide() {
    showSlide(++currentSlide);
}



function autoSlide() {
    nextSlide();
}

// Mostra o primeiro slide ao carregar a página
showSlide(currentSlide);

// Ativa o slide automático a cada 5 segundos
setInterval(autoSlide, 2000);
