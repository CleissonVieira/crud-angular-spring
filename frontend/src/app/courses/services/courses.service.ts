import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { take, delay } from 'rxjs/operators';

import { Course } from './../model/course';

@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  private readonly API = '/assets/courses.json'

  constructor(
    private httpClient: HttpClient
  ) { }

  getList() {
    return this.httpClient.get<Course[]>(this.API)
      .pipe(
        take(1),
        delay(1000)
       );
  }
}
