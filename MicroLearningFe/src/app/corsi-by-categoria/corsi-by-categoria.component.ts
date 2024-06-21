import { Component, Input } from '@angular/core';
import { Corsi } from '../corsi';
import { ApiService } from '../api.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-corsi-by-categoria',
  templateUrl: './corsi-by-categoria.component.html',
  styleUrl: './corsi-by-categoria.component.css'
})
export class CorsiByCategoriaComponent {

  corsi: Corsi[] = []
  categoria!: string 


  constructor(private service: ApiService, private route: ActivatedRoute ) {
    this.categoria = this.route.snapshot.paramMap.get("categoria")!;
   }

  ngOnInit(): void {
    
    this.service.getInsideCategoria(this.categoria).subscribe((data) => {
      this.corsi = data
    })
  }

}
