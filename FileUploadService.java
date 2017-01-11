/*
Uploading a file via REST using jersey, tomcat and Java
*/

package com.example.rest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;


@Path("/upload")
public class FileUploadService {

  private static final String UPLOAD_DIR = "/tmp/";
  
  @Context
  private UriInfo context;

  @POST
  @Consumes(MediaType.MULTIPART_FORM_DATA)
  public Response uploadFile(@FormDataParam("file") InputStream inputStream, @FormDataParam("file") FormDataContentDisposition fileDetail) {
    if (inputStream == null || fileDetail == null) {
      return Response.status(400).entity("Invalid form data").build()
    }

    String fileLocation = UPLOAD_DIR + fileDetail.getFileName();

    try {
      saveToFile(inputStream, fileLocation);
    } catch (IOException e) {
      return Response.status(500).entity("Unable to save file").build();
    }
      return Response.status(200).entity("File saved to " + fileLocation).build();
    }

    private void saveToFile(InputStream inStream, String target) throws IOException {
      OutputStream out = null;
      int read = 0;
      byte[] bytes = new byte[1024];
      out = new FileOutputStream(new File(target));
      while ((read = inStream.read(bytes)) != -1) {
        out.write(bytes, 0, read);
      }
      out.flush();
      out.close();
    }

}
