//Copyright (c) 2004 by Jordi Boehme Lopez (mail@jordi-boehme.de)
//
// See http://www.eclipsedesktop.org for more information.
package org.eclipsedesktop.cpumon.ui.view;

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipsedesktop.base.core.Util;
import org.eclipsedesktop.cpumon.ui.monitor.Cpumon;

/**
 * <p>TODO</p>
 * 
 * @author Jordi B�hme
 */
public class CpumonView extends ViewPart {

  // interface methods of ViewPart
  ////////////////////////////////
  public void createPartControl( final Composite parent ) {
    GridLayout gridLayout = Util.getGridLayout( 1, false, 1 );
    parent.setLayout( gridLayout );
    GridData gd = new GridData( GridData.FILL_HORIZONTAL );
    parent.setLayoutData( gd );
    IToolBarManager tbm = getViewSite().getActionBars().getToolBarManager();
    Cpumon monitor = new Cpumon();
    monitor.setMonitor( parent );
    monitor.setActions( tbm );
  }

  public void setFocus() {
    // TODO
  }
}