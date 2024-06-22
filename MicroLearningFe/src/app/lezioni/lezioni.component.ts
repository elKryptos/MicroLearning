import { Component } from '@angular/core';
import { Lezioni } from '../lezioni';
import { ApiService } from '../api.service';
import { ActivatedRoute } from '@angular/router';
import { Corsi } from '../corsi';

@Component({
  selector: 'app-lezioni',
  templateUrl: './lezioni.component.html',
  styleUrl: './lezioni.component.css'
})
export class LezioniComponent {

  lezioni!: Lezioni[];
  corsoId!: string;

  constructor(private service: ApiService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.corsoId = this.route.snapshot.paramMap.get('id')!;
    this.service.getLezioni(this.corsoId).subscribe((data) => {
      this.lezioni = data;
      console.log(data)
    })
  }

}
