/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.geolocation.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Geolocation. This utility wraps
 * {@link com.liferay.geolocation.service.impl.GeolocationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see GeolocationLocalService
 * @see com.liferay.geolocation.service.base.GeolocationLocalServiceBaseImpl
 * @see com.liferay.geolocation.service.impl.GeolocationLocalServiceImpl
 * @generated
 */
public class GeolocationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.geolocation.service.impl.GeolocationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the geolocation to the database. Also notifies the appropriate model listeners.
	*
	* @param geolocation the geolocation
	* @return the geolocation that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.geolocation.model.Geolocation addGeolocation(
		com.liferay.geolocation.model.Geolocation geolocation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addGeolocation(geolocation);
	}

	/**
	* Creates a new geolocation with the primary key. Does not add the geolocation to the database.
	*
	* @param geolocationId the primary key for the new geolocation
	* @return the new geolocation
	*/
	public static com.liferay.geolocation.model.Geolocation createGeolocation(
		long geolocationId) {
		return getService().createGeolocation(geolocationId);
	}

	/**
	* Deletes the geolocation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param geolocationId the primary key of the geolocation
	* @return the geolocation that was removed
	* @throws PortalException if a geolocation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.geolocation.model.Geolocation deleteGeolocation(
		long geolocationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteGeolocation(geolocationId);
	}

	/**
	* Deletes the geolocation from the database. Also notifies the appropriate model listeners.
	*
	* @param geolocation the geolocation
	* @return the geolocation that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.geolocation.model.Geolocation deleteGeolocation(
		com.liferay.geolocation.model.Geolocation geolocation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteGeolocation(geolocation);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.geolocation.model.impl.GeolocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.geolocation.model.impl.GeolocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.geolocation.model.Geolocation fetchGeolocation(
		long geolocationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchGeolocation(geolocationId);
	}

	/**
	* Returns the geolocation with the matching UUID and company.
	*
	* @param uuid the geolocation's UUID
	* @param companyId the primary key of the company
	* @return the matching geolocation, or <code>null</code> if a matching geolocation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.geolocation.model.Geolocation fetchGeolocationByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchGeolocationByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the geolocation with the primary key.
	*
	* @param geolocationId the primary key of the geolocation
	* @return the geolocation
	* @throws PortalException if a geolocation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.geolocation.model.Geolocation getGeolocation(
		long geolocationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getGeolocation(geolocationId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the geolocation with the matching UUID and company.
	*
	* @param uuid the geolocation's UUID
	* @param companyId the primary key of the company
	* @return the matching geolocation
	* @throws PortalException if a matching geolocation could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.geolocation.model.Geolocation getGeolocationByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getGeolocationByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of all the geolocations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.geolocation.model.impl.GeolocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of geolocations
	* @param end the upper bound of the range of geolocations (not inclusive)
	* @return the range of geolocations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.geolocation.model.Geolocation> getGeolocations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGeolocations(start, end);
	}

	/**
	* Returns the number of geolocations.
	*
	* @return the number of geolocations
	* @throws SystemException if a system exception occurred
	*/
	public static int getGeolocationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGeolocationsCount();
	}

	/**
	* Updates the geolocation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param geolocation the geolocation
	* @return the geolocation that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.geolocation.model.Geolocation updateGeolocation(
		com.liferay.geolocation.model.Geolocation geolocation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateGeolocation(geolocation);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.liferay.geolocation.model.Geolocation fetchGeolocation(
		long companyId, java.lang.String className, long classPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchGeolocation(companyId, className, classPK);
	}

	public static com.liferay.geolocation.model.Geolocation geoLocate(
		long companyId, java.lang.String className, long classPK,
		java.lang.String ipAddress, int maxAge,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .geoLocate(companyId, className, classPK, ipAddress, maxAge,
			serviceContext);
	}

	public static com.liferay.geolocation.model.Geolocation geoLocate(
		long companyId, java.lang.String className, long classPK,
		java.lang.String ipAddress,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .geoLocate(companyId, className, classPK, ipAddress,
			serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static GeolocationLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					GeolocationLocalService.class.getName());

			if (invokableLocalService instanceof GeolocationLocalService) {
				_service = (GeolocationLocalService)invokableLocalService;
			}
			else {
				_service = new GeolocationLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(GeolocationLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(GeolocationLocalService service) {
	}

	private static GeolocationLocalService _service;
}