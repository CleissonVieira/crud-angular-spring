import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { delay, take } from 'rxjs/operators';

import { Course } from './../model/course';

@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  private readonly API = 'api/courses'

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

  postSave(record: Partial<Course>) {
    return this.httpClient.post<Course>(this.API, record);
  }
}
