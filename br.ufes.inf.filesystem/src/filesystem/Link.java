/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package filesystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link filesystem.Link#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see filesystem.FilesystemPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends Node {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(Node)
	 * @see filesystem.FilesystemPackage#getLink_Node()
	 * @model required="true"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link filesystem.Link#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

} // Link
