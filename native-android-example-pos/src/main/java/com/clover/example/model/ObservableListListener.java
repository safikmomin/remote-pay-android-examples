/*
 * Copyright (C) 2018 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.example.model;

import java.io.Serializable;
import java.util.Collection;

public interface ObservableListListener<T> extends Serializable {
  public void itemAdded(T item, int index);

  public void itemRemoved(T item, int index);

  public void itemsAdded(Collection<T> items);

  public void itemsRemoved(Collection<T> items);

  public void listCleared();
}
