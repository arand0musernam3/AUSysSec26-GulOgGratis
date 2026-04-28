package com.braze.lrucache;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f9939a = Charset.forName("US-ASCII");

    static {
        Charset.forName(ArticleContentView.UTF_8_ENCODING_TYPE);
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            i4.a.l(file, "not a readable directory: ");
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                i4.a.l(file2, "failed to delete file: ");
                return;
            }
        }
    }
}
