import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustorderhistoryComponent } from './custorderhistory.component';

xdescribe('CustorderhistoryComponent', () => {
  let component: CustorderhistoryComponent;
  let fixture: ComponentFixture<CustorderhistoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustorderhistoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustorderhistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
