package p40;

import androidx.constraintlayout.widget.z;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import w2.l1;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements m40.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f34431f = Charset.forName(ArticleContentView.UTF_8_ENCODING_TYPE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m40.b f34432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m40.b f34433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o40.a f34434i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f34435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f34436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f34437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m40.c f34438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f34439e = new i(this);

    static {
        z zVarE = z.e();
        zVarE.f2542b = 1;
        f34432g = new m40.b("key", l1.i(l1.h(e.class, zVarE.c())));
        z zVarE2 = z.e();
        zVarE2.f2542b = 2;
        f34433h = new m40.b("value", l1.i(l1.h(e.class, zVarE2.c())));
        f34434i = new o40.a(1);
    }

    public g(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, m40.c cVar) {
        this.f34435a = byteArrayOutputStream;
        this.f34436b = map;
        this.f34437c = map2;
        this.f34438d = cVar;
    }

    public static int k(m40.b bVar) {
        e eVar = (e) ((Annotation) bVar.f29509b.get(e.class));
        if (eVar != null) {
            return eVar.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // m40.d
    public final m40.d a(m40.b bVar, Object obj) {
        i(bVar, obj, true);
        return this;
    }

    @Override // m40.d
    public final m40.d b(m40.b bVar, long j9) throws IOException {
        h(bVar, j9, true);
        return this;
    }

    @Override // m40.d
    public final m40.d c(m40.b bVar, int i11) {
        g(bVar, i11, true);
        return this;
    }

    @Override // m40.d
    public final m40.d d(m40.b bVar, double d3) throws IOException {
        f(bVar, d3, true);
        return this;
    }

    @Override // m40.d
    public final m40.d e(m40.b bVar, boolean z11) {
        g(bVar, z11 ? 1 : 0, true);
        return this;
    }

    public final void f(m40.b bVar, double d3, boolean z11) throws IOException {
        if (z11 && d3 == 0.0d) {
            return;
        }
        l((k(bVar) << 3) | 1);
        this.f34435a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d3).array());
    }

    public final void g(m40.b bVar, int i11, boolean z11) {
        if (z11 && i11 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) bVar.f29509b.get(e.class));
        if (eVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int i12 = f.f34430a[eVar.intEncoding().ordinal()];
        if (i12 == 1) {
            l(eVar.tag() << 3);
            l(i11);
        } else if (i12 == 2) {
            l(eVar.tag() << 3);
            l((i11 << 1) ^ (i11 >> 31));
        } else {
            if (i12 != 3) {
                return;
            }
            l((eVar.tag() << 3) | 5);
            this.f34435a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i11).array());
        }
    }

    public final void h(m40.b bVar, long j9, boolean z11) throws IOException {
        if (z11 && j9 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) bVar.f29509b.get(e.class));
        if (eVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int i11 = f.f34430a[eVar.intEncoding().ordinal()];
        if (i11 == 1) {
            l(eVar.tag() << 3);
            m(j9);
        } else if (i11 == 2) {
            l(eVar.tag() << 3);
            m((j9 >> 63) ^ (j9 << 1));
        } else {
            if (i11 != 3) {
                return;
            }
            l((eVar.tag() << 3) | 1);
            this.f34435a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j9).array());
        }
    }

    public final void i(m40.b bVar, Object obj, boolean z11) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z11 && charSequence.length() == 0) {
                return;
            }
            l((k(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f34431f);
            l(bytes.length);
            this.f34435a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(bVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(f34434i, bVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            f(bVar, ((Double) obj).doubleValue(), z11);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z11 && fFloatValue == 0.0f) {
                return;
            }
            l((k(bVar) << 3) | 5);
            this.f34435a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            h(bVar, ((Number) obj).longValue(), z11);
            return;
        }
        if (obj instanceof Boolean) {
            g(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z11);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z11 && bArr.length == 0) {
                return;
            }
            l((k(bVar) << 3) | 2);
            l(bArr.length);
            this.f34435a.write(bArr);
            return;
        }
        m40.c cVar = (m40.c) this.f34436b.get(obj.getClass());
        if (cVar != null) {
            j(cVar, bVar, obj, z11);
            return;
        }
        m40.e eVar = (m40.e) this.f34437c.get(obj.getClass());
        if (eVar != null) {
            i iVar = this.f34439e;
            iVar.f34441a = false;
            iVar.f34443c = bVar;
            iVar.f34442b = z11;
            eVar.a(obj, iVar);
            return;
        }
        if (obj instanceof c) {
            g(bVar, ((c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            g(bVar, ((Enum) obj).ordinal(), true);
        } else {
            j(this.f34438d, bVar, obj, z11);
        }
    }

    public final void j(m40.c cVar, m40.b bVar, Object obj, boolean z11) throws IOException {
        b bVar2 = new b();
        bVar2.f34429a = 0L;
        try {
            OutputStream outputStream = this.f34435a;
            this.f34435a = bVar2;
            try {
                cVar.a(obj, this);
                this.f34435a = outputStream;
                long j9 = bVar2.f34429a;
                bVar2.close();
                if (z11 && j9 == 0) {
                    return;
                }
                l((k(bVar) << 3) | 2);
                m(j9);
                cVar.a(obj, this);
            } catch (Throwable th2) {
                this.f34435a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void l(int i11) throws IOException {
        while (true) {
            long j9 = i11 & (-128);
            OutputStream outputStream = this.f34435a;
            if (j9 == 0) {
                outputStream.write(i11 & 127);
                return;
            } else {
                outputStream.write((i11 & 127) | 128);
                i11 >>>= 7;
            }
        }
    }

    public final void m(long j9) throws IOException {
        while (true) {
            long j11 = (-128) & j9;
            OutputStream outputStream = this.f34435a;
            if (j11 == 0) {
                outputStream.write(((int) j9) & 127);
                return;
            } else {
                outputStream.write((((int) j9) & 127) | 128);
                j9 >>>= 7;
            }
        }
    }
}
