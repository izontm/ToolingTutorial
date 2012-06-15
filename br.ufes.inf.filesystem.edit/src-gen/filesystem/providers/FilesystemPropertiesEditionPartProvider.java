/**
 * Generated with Acceleo
 */
package filesystem.providers;

import filesystem.parts.FilesystemViewsRepository;

import filesystem.parts.forms.FilePropertiesEditionPartForm;
import filesystem.parts.forms.FolderPropertiesEditionPartForm;
import filesystem.parts.forms.LinkPropertiesEditionPartForm;

import filesystem.parts.impl.FilePropertiesEditionPartImpl;
import filesystem.parts.impl.FolderPropertiesEditionPartImpl;
import filesystem.parts.impl.LinkPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class FilesystemPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == FilesystemViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == FilesystemViewsRepository.Folder.class) {
			if (kind == FilesystemViewsRepository.SWT_KIND)
				return new FolderPropertiesEditionPartImpl(component);
			if (kind == FilesystemViewsRepository.FORM_KIND)
				return new FolderPropertiesEditionPartForm(component);
		}
		if (key == FilesystemViewsRepository.File.class) {
			if (kind == FilesystemViewsRepository.SWT_KIND)
				return new FilePropertiesEditionPartImpl(component);
			if (kind == FilesystemViewsRepository.FORM_KIND)
				return new FilePropertiesEditionPartForm(component);
		}
		if (key == FilesystemViewsRepository.Link.class) {
			if (kind == FilesystemViewsRepository.SWT_KIND)
				return new LinkPropertiesEditionPartImpl(component);
			if (kind == FilesystemViewsRepository.FORM_KIND)
				return new LinkPropertiesEditionPartForm(component);
		}
		return null;
	}

}
