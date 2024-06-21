import { Component } from '@angular/core';
import { Lezioni } from '../lezioni';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-lezioni',
  templateUrl: './lezioni.component.html',
  styleUrl: './lezioni.component.css'
})
export class LezioniComponent {

  lezioni!: Lezioni[];
  id!: string;

  constructor(private service: ApiService) { }

  ngOnInit(): void {
    this.service.getLezioni("1").subscribe((data) => {
      this.lezioni = data;
      console.log(data)
    })
  }

  getInside(): void{
    console.log(this.lezioni)
  }
}
