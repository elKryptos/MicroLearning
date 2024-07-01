import { Component, Renderer2, ViewChild } from '@angular/core';
import { Corsi } from '../corsi';
import { ApiService } from '../api.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-ricerca',
  templateUrl: './ricerca.component.html',
  styleUrl: './ricerca.component.css'
})
export class RicercaComponent {
  @ViewChild('inputElement') inputElement: any;
  isShowed : boolean = false
  listCorsi : Corsi[]=[]
  selectCorsi !: Corsi []
  categoria : string [] = []

  constructor(private service:ApiService, private router : Router, private renderer : Renderer2){
      this.renderer.listen('window', 'click', (event: Event) => {
        if (!this.inputElement.nativeElement.contains(event.target)) {
          this.hideList();
        }
      });
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
    this.selectCorsi = this.listCorsi.filter(el=> 
      el.nome.toLowerCase().startsWith(searchTerm.toLowerCase()) || 
      el.categoria.toLowerCase().startsWith(searchTerm.toLowerCase())
    )
  }

  CategoriaClick(categoria: string){
    
    this.router.navigate(["/categorie", categoria])

  }

  goToLezione(corsoId: number): void {
    this.router.navigate(["/corsi", corsoId]);
    console.log(corsoId)
  } 
  hideList(){
    this.isShowed = false;
  }
  showList(){
    this.isShowed = true;
  }
  
}
