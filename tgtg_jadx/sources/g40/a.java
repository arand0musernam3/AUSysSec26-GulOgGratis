package g40;

import a40.h;
import a40.i;
import a40.k;
import android.util.Log;
import cz.j;
import d40.j2;
import e40.c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import w.a0;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f19991e = Charset.forName(ArticleContentView.UTF_8_ENCODING_TYPE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f19992f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f19993g = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f19994h = new i(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f19995i = new h(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f19996a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f19997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f19998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f19999d;

    public a(b bVar, j jVar, k kVar) {
        this.f19997b = bVar;
        this.f19998c = jVar;
        this.f19999d = kVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i11 = fileInputStream.read(bArr);
                if (i11 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f19991e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f19991e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        b bVar = this.f19997b;
        arrayList.addAll(b.m(((File) bVar.f20005f).listFiles()));
        arrayList.addAll(b.m(((File) bVar.f20006g).listFiles()));
        i iVar = f19994h;
        Collections.sort(arrayList, iVar);
        List listM = b.m(((File) bVar.f20004e).listFiles());
        Collections.sort(listM, iVar);
        arrayList.addAll(listM);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(b.m(((File) this.f19997b.f20003d).list())).descendingSet();
    }

    public final void d(j2 j2Var, String str, boolean z11) {
        b bVar = this.f19997b;
        int i11 = this.f19998c.h().f23341a.f15548a;
        f19993g.getClass();
        try {
            f(bVar.h(str, a0.p("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f19996a.getAndIncrement())), z11 ? "_" : "")), c.f15747a.e(j2Var));
        } catch (IOException e5) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e5);
        }
        h hVar = new h(3);
        bVar.getClass();
        File file = new File((File) bVar.f20003d, str);
        file.mkdirs();
        List<File> listM = b.m(file.listFiles(hVar));
        Collections.sort(listM, new i(6));
        int size = listM.size();
        for (File file2 : listM) {
            if (size <= i11) {
                return;
            }
            b.l(file2);
            size--;
        }
    }
}
