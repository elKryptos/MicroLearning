import { Component } from '@angular/core';
import { Corsi } from '../corsi';
import { ApiService } from '../api.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrl: './homepage.component.css'
})
export class HomepageComponent {


  listCorsi : Corsi[]=[]
  selectCorsi !: Corsi []
  categoria : string [] = []

  constructor(private service:ApiService, private router : Router){

  }

  ngOnInit():void{
    this.service.getAll().subscribe((data)=>{
      this.listCorsi = data
      this.selectCorsi = data
      console.log(data)
    }) 
  }

  selectedCorso(event: any){
    let searchTerm = event.target.value
    this.selectCorsi = this.listCorsi.filter(el=> {
      el.nome.toLowerCase().startsWith(searchTerm.toLowerCase()) || 
      el.categoria.toLowerCase().startsWith(searchTerm.toLowerCase())
    })
  }

  CategoriaClick(categoria: string){
    
    this.router.navigate(["/categorie", categoria])

  }


}
