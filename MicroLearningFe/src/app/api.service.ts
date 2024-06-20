import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Corsi } from './corsi';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private Url = "http://localhost:8080";

  constructor(private http: HttpClient) { }

  getCategorie(): Observable<string[]>{
    return this.http.get<string[]>(`${this.Url}/categorie`)
  }

  getAll(): Observable<Corsi[]>{
    return this.http.get<Corsi[]>(`${this.Url}/all`)
  }

  getInsideCategoria(categoria: string): Observable<Corsi[]>{
    return this.http.get<Corsi[]>(`${this.Url}/${categoria}`)
  }

}
