/*
 * Copyright (c) 2007-2013 Concurrent, Inc. All Rights Reserved.
 *
 * Project and contact information: http://www.cascading.org/
 *
 * This file is part of the Cascading project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cascading.pattern.model.tree.predicate;

/**
 *
 */
public abstract class SimplePredicate extends Predicate
  {
  String field;

  public SimplePredicate( String field )
    {
    this.field = field;
    }

  public String getArgumentField()
    {
    return field;
    }

  public abstract Boolean evaluate( Object argument );

  @Override
  public String toString()
    {
    final StringBuilder sb = new StringBuilder();
    sb.append( getClass().getSimpleName() ).append( "{" );
    sb.append( "field='" ).append( field ).append( '\'' );
    sb.append( '}' );
    return sb.toString();
    }
  }
