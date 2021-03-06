// Copyright (c) 2004 by Jordi Boehme Lopez (mail@jordi-boehme.de)
//
// See http://www.eclipsedesktop.org for more information.
package org.eclipsedesktop.sonicplayer.ui.views.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipsedesktop.sonicplayer.core.playlist.Playlist;

/** <p>TODO</p>
 * 
 * @author Jordi B�hme L�pez (mail@jordi-boehme.de)
 */
public class RemoveAction extends Action {

  private TableViewer viewer;

  public RemoveAction( final TableViewer tv ) {
    this.viewer = tv;
  }
  
  public void run() {
    if( viewer != null && !viewer.getControl().isDisposed() ) {
      StructuredSelection strctSel = ( StructuredSelection )viewer.getSelection();
      Object selection = (strctSel ).getFirstElement();
      Playlist.getInstance().remove( selection );
      viewer.refresh();
    }
  }
}