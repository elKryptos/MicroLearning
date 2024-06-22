import { Component } from '@angular/core';
import { Lezioni } from '../lezioni';
import { ApiService } from '../api.service';
import { ActivatedRoute, Route } from '@angular/router';
import { Corsi } from '../corsi';

@Component({
  selector: 'app-testo',
  templateUrl: './testo.component.html',
  styleUrl: './testo.component.css'
})
export class TestoComponent {

  lezione!: Lezioni[]
  id!: string

  constructor(private service: ApiService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.paramMap.get('id')!;
    this.service.getTesto(this.id).subscribe((data) => {
      this.lezione = data; 
      console.log(data)
    })
  }
}
