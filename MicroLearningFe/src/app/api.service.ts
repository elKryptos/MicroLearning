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
    return this.http.get<string[]>("http://localhost:8080/categorie")
  }

  getAll(): Observable<Corsi[]>{
    return this.http.get<Corsi[]>("http://localhost:8080/all")
  }

  // getInsideCategoria(): Observable<Corsi[]>{
  //   return this.http.get<Corsi[]>("http://localhost:8080/{categoria}")
  // }

  getInsideCategoria(categoria: string): Observable<Corsi[]>{
    return this.http.get<Corsi[]>("http://localhost:8080/" + categoria)
  }

}
