import { Component } from '@angular/core';
import { Corsi } from '../corsi';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-corsi',
  templateUrl: './corsi.component.html',
  styleUrl: './corsi.component.css'
})
export class CorsiComponent {

  corsi!: Corsi[];

  constructor(private service: ApiService) { }

  ngOnInit(): void {
    this.service.getAll().subscribe((data) => {
      this.corsi = data;
      console.log(data)
    })
  }

}
