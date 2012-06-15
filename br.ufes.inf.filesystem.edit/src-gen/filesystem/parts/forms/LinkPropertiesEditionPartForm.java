/**
 * Generated with Acceleo
 */
package filesystem.parts.forms;

// Start of user code for imports
import filesystem.parts.FilesystemViewsRepository;
import filesystem.parts.LinkPropertiesEditionPart;

import filesystem.providers.FilesystemMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer;

import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer.EObjectFlatComboViewerListener;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

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
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class LinkPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, LinkPropertiesEditionPart {

	protected Text name;
	protected AdvancedEObjectFlatComboViewer node;
	protected ViewerFilter nodeFilter;



	/**
	 * For {@link ISection} use only.
	 */
	public LinkPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LinkPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence linkStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = linkStep.addStep(FilesystemViewsRepository.Link.Properties.class);
		propertiesStep.addStep(FilesystemViewsRepository.Link.Properties.name);
		propertiesStep.addStep(FilesystemViewsRepository.Link.Properties.node);
		
		
		composer = new PartComposer(linkStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FilesystemViewsRepository.Link.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == FilesystemViewsRepository.Link.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == FilesystemViewsRepository.Link.Properties.node) {
					return createNodeFlatComboViewer(parent, widgetFactory);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(FilesystemMessages.LinkPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, FilesystemViewsRepository.Link.Properties.name, FilesystemMessages.LinkPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							LinkPropertiesEditionPartForm.this,
							FilesystemViewsRepository.Link.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LinkPropertiesEditionPartForm.this,
									FilesystemViewsRepository.Link.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LinkPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkPropertiesEditionPartForm.this, FilesystemViewsRepository.Link.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, FilesystemViewsRepository.Link.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FilesystemViewsRepository.Link.Properties.name, FilesystemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createNodeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, FilesystemViewsRepository.Link.Properties.node, FilesystemMessages.LinkPropertiesEditionPart_NodeLabel);
		// create callback listener
		EObjectFlatComboViewerListener listener = new EObjectFlatComboViewerListener(){
			public void handleSet(EObject element){
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkPropertiesEditionPartForm.this, FilesystemViewsRepository.Link.Properties.node, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, element)); 
			}
			public void navigateTo(EObject element){ }

			public EObject handleCreate() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LinkPropertiesEditionPartForm.this, FilesystemViewsRepository.Link.Properties.node, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null)); 
				return null;
			}

		};
		//create widget
		node = new AdvancedEObjectFlatComboViewer(FilesystemMessages.LinkPropertiesEditionPart_NodeLabel, resourceSet, nodeFilter, propertiesEditionComponent.getEditingContext().getAdapterFactory(), listener);
		node.createControls(parent, widgetFactory);
		GridData nodeData = new GridData(GridData.FILL_HORIZONTAL);
		node.setLayoutData(nodeData);
		node.setID(FilesystemViewsRepository.Link.Properties.node);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FilesystemViewsRepository.Link.Properties.node, FilesystemViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
