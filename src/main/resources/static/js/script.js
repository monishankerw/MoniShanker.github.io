function validateForm(): boolean {
    const username = (<HTMLInputElement>document.getElementById('username')).value;
    const email = (<HTMLInputElement>document.getElementById('email')).value;
    const phone = (<HTMLInputElement>document.getElementById('phone')).value;

    if (!username || !email || !phone) {
        alert('Please fill out all required fields.');
        return false;
    }

    return true;
}

document.getElementById('userForm')?.addEventListener('mousemove', (e: MouseEvent) => {
    const card = document.querySelector('.card') as HTMLElement;
    const { offsetWidth: width, offsetHeight: height } = card;
    const { offsetX: x, offsetY: y } = e;

    const rotateX = ((y / height) - 0.5) * 10;
    const rotateY = ((x / width) - 0.5) * -10;

    card.style.transform = `rotateX(${rotateX}deg) rotateY(${rotateY}deg)`;
});

document.getElementById('userForm')?.addEventListener('mouseleave', () => {
    const card = document.querySelector('.card') as HTMLElement;
    card.style.transform = 'rotateX(0) rotateY(0)';
});
