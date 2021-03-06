/********************************************************************************* 
* Ephesoft is a Intelligent Document Capture and Mailroom Automation program 
* developed by Ephesoft, Inc. Copyright (C) 2010-2012 Ephesoft Inc. 
* 
* This program is free software; you can redistribute it and/or modify it under 
* the terms of the GNU Affero General Public License version 3 as published by the 
* Free Software Foundation with the addition of the following permission added 
* to Section 15 as permitted in Section 7(a): FOR ANY PART OF THE COVERED WORK 
* IN WHICH THE COPYRIGHT IS OWNED BY EPHESOFT, EPHESOFT DISCLAIMS THE WARRANTY 
* OF NON INFRINGEMENT OF THIRD PARTY RIGHTS. 
* 
* This program is distributed in the hope that it will be useful, but WITHOUT 
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
* FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License for more 
* details. 
* 
* You should have received a copy of the GNU Affero General Public License along with 
* this program; if not, see http://www.gnu.org/licenses or write to the Free 
* Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 
* 02110-1301 USA. 
* 
* You can contact Ephesoft, Inc. headquarters at 111 Academy Way, 
* Irvine, CA 92617, USA. or at email address info@ephesoft.com. 
* 
* The interactive user interfaces in modified source and object code versions 
* of this program must display Appropriate Legal Notices, as required under 
* Section 5 of the GNU Affero General Public License version 3. 
* 
* In accordance with Section 7(b) of the GNU Affero General Public License version 3, 
* these Appropriate Legal Notices must retain the display of the "Ephesoft" logo. 
* If the display of the logo is not reasonably feasible for 
* technical reasons, the Appropriate Legal Notices must display the words 
* "Powered by Ephesoft". 
********************************************************************************/ 

package com.ephesoft.dcma.imagemagick;

import com.ephesoft.dcma.core.common.PluginProperty;


/**
 * This enum stores all the properties.
 * 
 * @author Ephesoft
 * @version 1.0
 * @see com.ephesoft.dcma.imagemagick.service.ImageProcessServiceImpl 
 */
public enum ImageMagicProperties implements PluginProperty {
	
	/**
	 * Ghost script image parameters name in properties file.
	 */
	GS_IMAGE_PARAMETERS("ghostscript.image_parameters"),
	/**
	 * Imagemagick input convert image parameters name in properties file.
	 */
	IM_CONVERT_INPUT_IMAGE_PARAMETERS("imagemagick.open_input_image_parameters"),
	/**
	 * Imagemagick output parameters for convert command name in properties file.
	 */
	IM_CONVERT_OUTPUT_IMAGE_PARAMETERS("imagemagick.save_output_image_parameters"),
	/**
	 * Classification switch name in properties file.
	 */
	CLASSIFY_IMAGES_SWITCH("classifyImage.switch"),
	/**
	 * Classify image comparison metric property name.
	 */
	CLASSIFY_IMAGES_COMP_METRIC("classifyImages.comparison_metric"),
	/**
	 * Imagemagick classify image fuzz percentage property name.
	 */
	CLASSIFY_IMAGES_FUZZ_PERCNT("classifyImages.fuzz_percentage"),
	/**
	 * Classify image max results property name.
	 */
	CLASSIFY_IMAGES_MAX_RESULTS("classifyImages.max_results"),
	/**
	 * Switch for creating thumbnail in properties file.
	 */
	CREATE_THUMBNAILS_SWITCH("createThumbnails.switch"),
	/**
	 * Property name for thumbnails display image height.
	 */
	CREATE_THUMBNAILS_DISP_THUMB_HEIGHT("createThumbnails.display_image_height"),
	/**
	 * Property name for thumbnails display image width.
	 */
	CREATE_THUMBNAILS_DISP_THUMB_WIDTH("createThumbnails.display_image_width"),
	/**
	 * Property name for thumbnails compare image width.
	 */
	CREATE_THUMBNAILS_COMP_THUMB_WIDTH("createThumbnails.compare_image_width"),
	/**
	 * Property name for thumbnails compare image height.
	 */
	CREATE_THUMBNAILS_COMP_THUMB_HEIGHT("createThumbnails.compare_image_height"),
	/**
	 * Property name for display thumbnail type.
	 */
	CREATE_THUMBNAILS_DISP_THUMB_TYPE("createThumbnails.display_thumbnail_type"),
	/**
	 * Property name for compare thumbnail type.
	 */
	CREATE_THUMBNAILS_COMP_THUMB_TYPE("createThumbnails.compare_thumbnail_type"),
	/**
	 * Property name for output image parameters.
	 */
	CREATE_THUMBNAILS_OUTPUT_IMAGE_PARAMETERS("createThumbnails.output_image_parameters"),
	/**
	 * Property name for ocr create input display thumbnail.
	 */
	CREATE_OCR_INPUT_DISP_THUMB_TYPE("createocr.display_thumbnail_type"),
	/**
	 * Property name for compare thumbnail type ocring.
	 */
	CREATE_OCR_INPUT_COMP_THUMB_TYPE("createocr.compare_thumbnail_type"),
	/**
	 * Property name for creating display image of thumbnail type.
	 */
	CREATE_DISPLAY_IMAGE_DISP_THUMB_TYPE("createDisplay.display_thumbnail_type"),
	/**
	 * Property name for creating compare image of thumbnail type.
	 */
	CREATE_DISPLAY_IMAGE_COMP_THUMB_TYPE("createDisplay.compare_thumbnail_type"),
	/**
	 * Property name for create multipage tiff switch.
	 */
	CREATE_MULTIPAGE_TIFF_SWITCH("createMultipageTif.switch"),
	/**
	 * Check pdf export process.
	 */
	CHECK_PDF_EXPORT_PROCESS("createMultipageTif.export_process"),
	/**
	 * Create multipage coloured pdf.
	 */
	CHECK_COLOURED_PDF("createMultipageTif.coloured_pdf"),
	/**
	 * Create multipage tiff to searchable pdf.
	 */
	CHECK_SEARCHABLE_PDF("createMultipageTif.searchable_pdf"),
	/**
	 * Ghostscript pdf creation parameters.
	 */
	GHOSTSCRIPT_COMMAND_PDF_PARAMETERS("createMultipageTif.ghostscript_pdf_parameters"),
	/**
	 * PDF optimization parameters.
	 */
	PDF_OPTIMIZATION_PARAMETERS("createMultipageTif.optimization_parameters"),
	/**
	 * PDF optimization switch.
	 */
	PDF_OPTIMIZATION_SWITCH("createMultipageTif.pdf_optimization_switch");
	
	/**
	 * This key is used to fetch the values of the properties.
	 */
	String key;

	ImageMagicProperties(String key) {
		this.key = key;
	}

	@Override
	public String getPropertyKey() {
		return key;
	}
}
