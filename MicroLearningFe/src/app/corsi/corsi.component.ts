import { Component } from '@angular/core';
import { Corsi } from '../corsi';
import { ApiService } from '../api.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-corsi',
  templateUrl: './corsi.component.html',
  styleUrl: './corsi.component.css'
})
export class CorsiComponent {

  corsi!: Corsi[];

  constructor(private service: ApiService, private router: Router) { }

  ngOnInit(): void {
    this.service.getAll().subscribe((data) => {
      this.corsi = data;
      console.log(data)
    })
  }

  goToLezione(corsoId: number): void {
    this.router.navigate(["/corsi", corsoId]);
    console.log(corsoId)
  } 

}
