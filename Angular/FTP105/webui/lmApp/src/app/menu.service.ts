import { Injectable } from '@angular/core';
import { Menu } from './menu';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable()
export class MenuServiceService {

  constructor(private httpClient: HttpClient) { }
  getMenu(): Observable<Menu[]> {
    const url = 'http://localhost:8080/FTP105/api/menu';
    return this.httpClient.get<Menu[]>(url);
  }
}
