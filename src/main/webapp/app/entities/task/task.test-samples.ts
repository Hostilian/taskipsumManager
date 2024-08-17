import dayjs from 'dayjs/esm';

import { ITask, NewTask } from './task.model';

export const sampleWithRequiredData: ITask = {
  id: '8135f7fa-a249-4ea9-8206-f0a0a5429c4c',
};

export const sampleWithPartialData: ITask = {
  id: 'dbeeccef-8fba-450c-be04-f2d2dc0bcd57',
  title: 'raid',
  completed: true,
};

export const sampleWithFullData: ITask = {
  id: '03b1f71b-6f91-4603-9b73-de0fe78f14af',
  dueDate: dayjs('2024-08-16'),
  title: 'wrongly to playfully',
  description: 'circa',
  completed: false,
};

export const sampleWithNewData: NewTask = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
