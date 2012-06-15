/**
 * Generated with Acceleo
 */
package filesystem.parts.impl;

// Start of user code for imports
import filesystem.parts.FilesystemViewsRepository;
import filesystem.parts.LinkPropertiesEditionPart;

import filesystem.providers.FilesystemMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer;

import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer.EObjectFlatComboViewerListener;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class LinkPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, LinkPropertiesEditionPart {

	protected Text name;
	private AdvancedEObjectFlatComboViewer node;
	protected ViewerFilter nodeFilter;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LinkPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence linkStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = linkStep.addStep(FilesystemViewsRepository.Link.Properties.class);
		propertiesStep.addStep(FilesystemViewsRepository.Link.Properties.name);
		propertiesStep.addStep(FilesystemViewsRepository.Link.Properties.node);
		
		
		composer = new PartComposer(linkStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FilesystemViewsRepository.Link.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == FilesystemViewsRepository.Link.Properties.name) {
					return createNameText(parent);
				}
				if (key == FilesystemViewsRepository.Link.Properties.node) {
					return createNodeAdvancedFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(FilesystemMessages.LinkPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, FilesystemViewsRepository.Link.Properties.name, FilesystemMessages.LinkPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkPropertiesEditionPartImpl.this, FilesystemViewsRepository.Link.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkPropertiesEditionPartImpl.this, FilesystemViewsRepository.Link.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, FilesystemViewsRepository.Link.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FilesystemViewsRepository.Link.Properties.name, FilesystemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createNodeAdvancedFlatComboViewer(Composite parent) {
		createDescription(parent, FilesystemViewsRepository.Link.Properties.node, FilesystemMessages.LinkPropertiesEditionPart_NodeLabel);
		// create callback listener
		EObjectFlatComboViewerListener listener = new EObjectFlatComboViewerListener(){
			public void handleSet(EObject element){
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkPropertiesEditionPartImpl.this, FilesystemViewsRepository.Link.Properties.node, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, element)); 
			}
			public void navigateTo(EObject element){ }

			public EObject handleCreate() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkPropertiesEditionPartImpl.this, FilesystemViewsRepository.Link.Properties.node, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null)); 
				return null;
			}
		};
		//create widget
		node = new AdvancedEObjectFlatComboViewer(getDescription(FilesystemViewsRepository.Link.Properties.node, FilesystemMessages.LinkPropertiesEditionPart_NodeLabel), resourceSet, nodeFilter, propertiesEditionComponent.getEditingContext().getAdapterFactory(), listener);
		node.createControls(parent);
		GridData nodeData = new GridData(GridData.FILL_HORIZONTAL);
		node.setLayoutData(nodeData);
		node.setID(FilesystemViewsRepository.Link.Properties.node);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FilesystemViewsRepository.Link.Properties.node, FilesystemViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see filesystem.parts.LinkPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see filesystem.parts.LinkPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see filesystem.parts.LinkPropertiesEditionPart#getNode()
	 * 
	 */
	public EObject getNode() {
		return node.getSelection();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see filesystem.parts.LinkPropertiesEditionPart#initNode(EObjectFlatComboSettings)
	 */
	public void initNode(EObjectFlatComboSettings settings) {
		node.setInput(settings);
		if (current != null) {
			node.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see filesystem.parts.LinkPropertiesEditionPart#setNode(EObject newValue)
	 * 
	 */
	public void setNode(EObject newValue) {
		if (newValue != null) {
			node.setSelection(new StructuredSelection(newValue));
		} else {
			node.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see filesystem.parts.LinkPropertiesEditionPart#setNodeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setNodeButtonMode(ButtonsModeEnum newValue) {
		node.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see filesystem.parts.LinkPropertiesEditionPart#addFilterNode(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNode(ViewerFilter filter) {
		node.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see filesystem.parts.LinkPropertiesEditionPart#addBusinessFilterNode(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNode(ViewerFilter filter) {
		node.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FilesystemMessages.Link_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
