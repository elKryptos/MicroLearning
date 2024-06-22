import { Component } from '@angular/core';
import { Lezioni } from '../lezioni';
import { ApiService } from '../api.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Corsi } from '../corsi';

@Component({
  selector: 'app-lezioni',
  templateUrl: './lezioni.component.html',
  styleUrl: './lezioni.component.css'
})
export class LezioniComponent {

  corsi!: Corsi[];
  lezioni!: Lezioni[];
  corsoId!: string;

  constructor(private service: ApiService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.corsoId = this.route.snapshot.paramMap.get('id')!;
    this.service.getLezioni(this.corsoId).subscribe((lezioni) => {
      this.lezioni = lezioni
    });
  }

  goToTesto(id: number): void {
    this.router.navigate(["/testo", id])
  }
}