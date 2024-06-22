import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Corsi } from './corsi';
import { Lezioni } from './lezioni';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private Url = "http://localhost:8080";

  constructor(private http: HttpClient) { }

  getCategorie(): Observable<string[]>{
    return this.http.get<string[]>(`${this.Url}/categorie`)
  }

  getInsideCategoria(categoria: string): Observable<Corsi[]>{
    return this.http.get<Corsi[]>(`${this.Url}/${categoria}`)
  }
  
  getAll(): Observable<Corsi[]>{
    return this.http.get<Corsi[]>(`${this.Url}/corsi`)
  }

  getLezioni(id: string): Observable<Lezioni[]> {
    return this.http.get<Lezioni[]>(`${this.Url}/lezione/${id}`)
  }

  getTesto(id: string): Observable<Lezioni[]> {
    return this.http.get<Lezioni[]>(`${this.Url}/inside/${id}`)
  }

}
