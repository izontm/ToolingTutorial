/**
 * Generated with Acceleo
 */
package filesystem.providers;

import filesystem.providers.FilePropertiesEditionProvider;
import filesystem.providers.FolderPropertiesEditionProvider;
import filesystem.providers.LinkPropertiesEditionProvider;

import filesystem.util.FilesystemAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class FilesystemEEFAdapterFactory extends FilesystemAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see .filesystem.util.FilesystemAdapterFactory#createFolderAdapter()
	 * 
	 */
	public Adapter createFolderAdapter() {
		return new FolderPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .filesystem.util.FilesystemAdapterFactory#createFileAdapter()
	 * 
	 */
	public Adapter createFileAdapter() {
		return new FilePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .filesystem.util.FilesystemAdapterFactory#createLinkAdapter()
	 * 
	 */
	public Adapter createLinkAdapter() {
		return new LinkPropertiesEditionProvider();
	}

}
