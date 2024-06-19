import { Component } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-categorie',
  templateUrl: './categorie.component.html',
  styleUrl: './categorie.component.css'
})
export class CategorieComponent {

  categorie: string[] =[];


  constructor(private service: ApiService) { }

  ngOnInit(): void {
    this.service.getCategorie().subscribe((data) => {
      this.categorie = data
      console.log(this.categorie)
      console.log(data)
    });
  }


}
