import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'MicroLearningFe';

  ngAfterViewInit(): void {
    const menuIcon = document.getElementById('menu-icon');
    const menuLinks = document.getElementById('menu-links');
    const links = menuLinks?.getElementsByTagName('a');

    menuIcon?.addEventListener('click', function() {
      if (menuLinks?.classList.contains('show')) {
        menuLinks.classList.remove('show');
      } else {
        menuLinks?.classList.add('show');
      }
    });

    if (links) {
      for (let i = 0; i < links.length; i++) {
        links[i].addEventListener('click', function() {
          menuLinks?.classList.remove('show');
        });
      }
    }
  }

  
}
