import { Component } from '@angular/core';
import { Corsi } from '../corsi';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-corsi-by-categoria',
  templateUrl: './corsi-by-categoria.component.html',
  styleUrl: './corsi-by-categoria.component.css'
})
export class CorsiByCategoriaComponent {

  corsi!: Corsi[]
  categoria!: string 

  constructor(private service: ApiService) { }

  ngOnInit(): void {
    this.service.getInsideCategoria("storia").subscribe((data) => {
      this.corsi = data;
      console.log(data)
    })
  }
}
