package o40;

import android.util.Base64;
import android.util.JsonWriter;
import com.braze.h2;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements m40.d, m40.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31982a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonWriter f31983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f31984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f31985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m40.c f31986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f31987f;

    public e(Writer writer, HashMap map, HashMap map2, a aVar, boolean z11) {
        this.f31983b = new JsonWriter(writer);
        this.f31984c = map;
        this.f31985d = map2;
        this.f31986e = aVar;
        this.f31987f = z11;
    }

    @Override // m40.d
    public final m40.d a(m40.b bVar, Object obj) throws IOException {
        h(obj, bVar.f29508a);
        return this;
    }

    @Override // m40.f
    public final m40.f add(String str) throws IOException {
        i();
        this.f31983b.value(str);
        return this;
    }

    @Override // m40.d
    public final m40.d b(m40.b bVar, long j9) throws IOException {
        String str = bVar.f29508a;
        i();
        JsonWriter jsonWriter = this.f31983b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(j9);
        return this;
    }

    @Override // m40.d
    public final m40.d c(m40.b bVar, int i11) throws IOException {
        String str = bVar.f29508a;
        i();
        JsonWriter jsonWriter = this.f31983b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(i11);
        return this;
    }

    @Override // m40.d
    public final m40.d d(m40.b bVar, double d3) throws IOException {
        String str = bVar.f29508a;
        i();
        JsonWriter jsonWriter = this.f31983b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(d3);
        return this;
    }

    @Override // m40.d
    public final m40.d e(m40.b bVar, boolean z11) throws IOException {
        String str = bVar.f29508a;
        i();
        JsonWriter jsonWriter = this.f31983b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(z11);
        return this;
    }

    @Override // m40.f
    public final m40.f f(boolean z11) throws IOException {
        i();
        this.f31983b.value(z11);
        return this;
    }

    public final e g(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f31983b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    g(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        h(entry.getValue(), (String) key);
                    } catch (ClassCastException e5) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e5);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            m40.c cVar = (m40.c) this.f31984c.get(obj.getClass());
            if (cVar != null) {
                jsonWriter.beginObject();
                cVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            m40.e eVar = (m40.e) this.f31985d.get(obj.getClass());
            if (eVar != null) {
                eVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f31986e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof f) {
                int number = ((f) obj).getNumber();
                i();
                jsonWriter.value(number);
                return this;
            }
            String strName = ((Enum) obj).name();
            i();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            i();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i11 = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i11 < length) {
                jsonWriter.value(r6[i11]);
                i11++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i11 < length2) {
                long j9 = jArr[i11];
                i();
                jsonWriter.value(j9);
                i11++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i11 < length3) {
                jsonWriter.value(dArr[i11]);
                i11++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i11 < length4) {
                jsonWriter.value(zArr[i11]);
                i11++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i11 < length5) {
                g(numberArr[i11]);
                i11++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i11 < length6) {
                g(objArr[i11]);
                i11++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e h(Object obj, String str) throws IOException {
        boolean z11 = this.f31987f;
        JsonWriter jsonWriter = this.f31983b;
        if (z11) {
            if (obj == null) {
                return this;
            }
            i();
            jsonWriter.name(str);
            g(obj);
            return this;
        }
        i();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        g(obj);
        return this;
    }

    public final void i() {
        if (this.f31982a) {
            return;
        }
        h2.b("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
