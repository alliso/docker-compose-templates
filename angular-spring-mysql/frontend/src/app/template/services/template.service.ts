import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Template } from '../interfaces/template';

@Injectable({
  providedIn: 'root'
})
export class TemplateService {

  private baseUrl: string = `${environment.templateUrl}/templates`;

  constructor( private http: HttpClient ) { }

  getTemplates(): Observable<Template[]> {
    return this.http.get<Template[]>(this.baseUrl);
  }

  getTemplateById( id: number ): Observable<Template> {
    return this.http.get<Template>(`${this.baseUrl}/${id}`);
  }

  createTemplate( template: Template ): Observable<Template> {
    return this.http.post<Template>(this.baseUrl, template);
  }

}
