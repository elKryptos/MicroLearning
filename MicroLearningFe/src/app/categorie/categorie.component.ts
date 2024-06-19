import { Component } from '@angular/core';
import { ApiService } from '../api.service';
import { Corsi } from '../corsi';

@Component({
  selector: 'app-categorie',
  templateUrl: './categorie.component.html',
  styleUrl: './categorie.component.css'
})
export class CategorieComponent {

  corsi!: Corsi[];
  categorie: string[] =[];


  constructor(private service: ApiService) { }

  ngOnInit(): void {
    this.service.getCategorie().subscribe((data) => {
      this.categorie = data
      console.log(this.categorie)
      console.log(data)
    });
  }

  getAll(categoria: string): void {
    this.service.getInsideCategoria(categoria).subscribe((data) => {
      console.log(data);
    })
  }
}
