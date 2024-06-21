import { Component } from '@angular/core';
import { ApiService } from '../api.service';
import { Corsi } from '../corsi';
import { Router } from '@angular/router';

@Component({
  selector: 'app-categorie',
  templateUrl: './categorie.component.html',
  styleUrl: './categorie.component.css'
})
export class CategorieComponent {

  categorie: string[] = [];

  constructor(private service: ApiService, private router: Router) { }

  ngOnInit(): void {
    this.service.getCategorie().subscribe((data) => {
      this.categorie = data
    });
  }

  getAll(categoria: string): void {
    this.router.navigate(["/categorie", categoria])
  }
}
