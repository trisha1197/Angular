import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms'; // needed
import { VendordashboardComponent } from './vendordashboard.component';
import { DebugElement } from '@angular/core';
import { By } from '@angular/platform-browser';
import {NO_ERRORS_SCHEMA} from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { HttpClient, HttpClientModule } from '@angular/common/http';

describe('VendordashboardComponent', () => {
  let component: VendordashboardComponent;
  let fixture: ComponentFixture<VendordashboardComponent>;
  let de: DebugElement;
  let el: HTMLElement;


  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VendordashboardComponent ],
      imports: [ReactiveFormsModule,HttpClientModule],
      schemas:[NO_ERRORS_SCHEMA],
      providers: [
        {provide: Router, useClass: MockRouter},
        {provide: ActivatedRoute, 
          useValue:
          {
            
          }
        } //mockActiveRouter}
      ]
    })
    .compileComponents();
  }));
  class MockRouter {}
  class MockActiveRouter {
  }
  beforeEach(() => {
    fixture = TestBed.createComponent(VendordashboardComponent);
    component = fixture.componentInstance;
    de = fixture.debugElement.query(By.css('form'));
    el = de.nativeElement;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should call the vconf method when vconf button is clicked ', async() => {
    fixture.detectChanges();
    spyOn(component, 'vconf');
    el = fixture.debugElement.query ( By.css('button')).nativeElement;
    el.click();
    expect(component.vconf).toHaveBeenCalledTimes(1);
  });








});
