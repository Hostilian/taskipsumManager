import dayjs from 'dayjs/esm';

export interface ITask {
  id: string;
  dueDate?: dayjs.Dayjs | null;
  title?: string | null;
  description?: string | null;
  completed?: boolean | null;
}

export type NewTask = Omit<ITask, 'id'> & { id: null };
