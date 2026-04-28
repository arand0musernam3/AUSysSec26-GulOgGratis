package w;

import android.media.MediaCodec;
import android.util.Log;
import com.braze.h2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m0.m1;
import s0.l1;
import s0.o2;
import s0.q2;
import s0.x0;
import s0.y1;
import s0.z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f42716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f42717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u70.t f42718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u70.t f42719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u70.t f42720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u70.t f42721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u70.t f42722g;

    public l0(Collection collection, boolean z11) {
        collection.getClass();
        this.f42716a = collection;
        this.f42717b = z11;
        final int i11 = 0;
        this.f42718c = u70.l.b(new Function0(this) { // from class: w.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f42713b;

            {
                this.f42713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        ArrayList<z1> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        l0 l0Var = this.f42713b;
                        for (m1 m1Var : l0Var.f42716a) {
                            boolean z12 = l0Var.f42717b;
                            m1Var.getClass();
                            z1 z1Var = z12 ? m1Var.f28566p : m1Var.f28567q;
                            z1Var.getClass();
                            arrayList.add(z1Var);
                            o2 o2Var = m1Var.f28560i;
                            o2Var.getClass();
                            arrayList2.add(o2Var);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((z1) it.next()).f38494g.f38440c == 5) {
                                    if (wd.a.B(6, "CXCP")) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
                                    o0Var.getClass();
                                    break;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        s0.g gVar = c0.g.f6802a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                z1 z1Var2 = (z1) it2.next();
                                if (!z1Var2.f38494g.f38439b.f38383a.containsKey(gVar) || z1Var2.b().size() == 1) {
                                    if (z1Var2.f38494g.f38439b.f38383a.containsKey(gVar)) {
                                        int i12 = 0;
                                        for (z1 z1Var3 : arrayList) {
                                            if (((o2) arrayList3.get(i12)).n() == q2.METERING_REPEATING) {
                                                z1Var3.b().getClass();
                                                pd.g.n("MeteringRepeating should contain a surface", !r8.isEmpty());
                                                linkedHashMap.put(z1Var3.b().get(0), 1L);
                                            } else if (z1Var3.f38494g.f38439b.f38383a.containsKey(gVar)) {
                                                List listB = z1Var3.b();
                                                listB.getClass();
                                                if (!listB.isEmpty()) {
                                                    Object obj = z1Var3.b().get(0);
                                                    Object objD = z1Var3.f38494g.f38439b.d(gVar);
                                                    objD.getClass();
                                                    linkedHashMap.put(obj, objD);
                                                }
                                            }
                                            i12++;
                                        }
                                    }
                                } else if (wd.a.B(6, "CXCP")) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + z1Var2.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                }
                            }
                        }
                        if (wd.a.B(3, "CXCP")) {
                            Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        }
                        break;
                    case 1:
                        l0 l0Var2 = this.f42713b;
                        Collection<m1> collection2 = l0Var2.f42716a;
                        ArrayList<z1> arrayList4 = new ArrayList(kotlin.collections.e0.o(collection2, 10));
                        for (m1 m1Var2 : collection2) {
                            boolean z13 = l0Var2.f42717b;
                            m1Var2.getClass();
                            z1 z1Var4 = z13 ? m1Var2.f28566p : m1Var2.f28567q;
                            z1Var4.getClass();
                            arrayList4.add(z1Var4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (z1 z1Var5 : arrayList4) {
                            List<x0> listB2 = z1Var5.b();
                            s0.r0 r0Var = z1Var5.f38494g;
                            for (x0 x0Var : listB2) {
                                l1 l1Var = r0Var.f38439b;
                                s0.g gVar2 = b0.b.f5060i;
                                if (!l1Var.f38383a.containsKey(gVar2) || l1Var.d(gVar2) == null) {
                                    linkedHashMap2.put(x0Var, Long.valueOf(Intrinsics.areEqual(x0Var.f38474j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objD2 = l1Var.d(gVar2);
                                    objD2.getClass();
                                    linkedHashMap2.put(x0Var, objD2);
                                }
                            }
                        }
                        break;
                    case 2:
                        y1 y1Var = new y1();
                        l0 l0Var3 = this.f42713b;
                        for (m1 m1Var3 : l0Var3.f42716a) {
                            boolean z14 = l0Var3.f42717b;
                            m1Var3.getClass();
                            z1 z1Var6 = z14 ? m1Var3.f28566p : m1Var3.f28567q;
                            z1Var6.getClass();
                            y1Var.a(z1Var6);
                        }
                        break;
                    case 3:
                        u70.t tVar = this.f42713b.f42720e;
                        if (!((y1) tVar.getValue()).c()) {
                            h2.b("Check failed.");
                        }
                        break;
                    default:
                        l0 l0Var4 = this.f42713b;
                        u70.t tVar2 = l0Var4.f42721f;
                        if (((y1) l0Var4.f42720e.getValue()).c()) {
                            s0.l lVar = ((z1) tVar2.getValue()).f38489b;
                            if (lVar != null) {
                                ArrayList arrayList5 = new ArrayList();
                                List listB3 = ((z1) tVar2.getValue()).b();
                                listB3.getClass();
                                arrayList5.addAll(listB3);
                                x0 x0Var2 = lVar.f38374a;
                                x0Var2.getClass();
                                arrayList5.add(x0Var2);
                                List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                                if (listUnmodifiableList != null) {
                                }
                            }
                        } else {
                            h2.b("Check failed.");
                        }
                        break;
                }
                return null;
            }
        });
        final int i12 = 1;
        this.f42719d = u70.l.b(new Function0(this) { // from class: w.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f42713b;

            {
                this.f42713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        ArrayList<z1> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        l0 l0Var = this.f42713b;
                        for (m1 m1Var : l0Var.f42716a) {
                            boolean z12 = l0Var.f42717b;
                            m1Var.getClass();
                            z1 z1Var = z12 ? m1Var.f28566p : m1Var.f28567q;
                            z1Var.getClass();
                            arrayList.add(z1Var);
                            o2 o2Var = m1Var.f28560i;
                            o2Var.getClass();
                            arrayList2.add(o2Var);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((z1) it.next()).f38494g.f38440c == 5) {
                                    if (wd.a.B(6, "CXCP")) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
                                    o0Var.getClass();
                                    break;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        s0.g gVar = c0.g.f6802a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                z1 z1Var2 = (z1) it2.next();
                                if (!z1Var2.f38494g.f38439b.f38383a.containsKey(gVar) || z1Var2.b().size() == 1) {
                                    if (z1Var2.f38494g.f38439b.f38383a.containsKey(gVar)) {
                                        int i122 = 0;
                                        for (z1 z1Var3 : arrayList) {
                                            if (((o2) arrayList3.get(i122)).n() == q2.METERING_REPEATING) {
                                                z1Var3.b().getClass();
                                                pd.g.n("MeteringRepeating should contain a surface", !r8.isEmpty());
                                                linkedHashMap.put(z1Var3.b().get(0), 1L);
                                            } else if (z1Var3.f38494g.f38439b.f38383a.containsKey(gVar)) {
                                                List listB = z1Var3.b();
                                                listB.getClass();
                                                if (!listB.isEmpty()) {
                                                    Object obj = z1Var3.b().get(0);
                                                    Object objD = z1Var3.f38494g.f38439b.d(gVar);
                                                    objD.getClass();
                                                    linkedHashMap.put(obj, objD);
                                                }
                                            }
                                            i122++;
                                        }
                                    }
                                } else if (wd.a.B(6, "CXCP")) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + z1Var2.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                }
                            }
                        }
                        if (wd.a.B(3, "CXCP")) {
                            Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        }
                        break;
                    case 1:
                        l0 l0Var2 = this.f42713b;
                        Collection<m1> collection2 = l0Var2.f42716a;
                        ArrayList<z1> arrayList4 = new ArrayList(kotlin.collections.e0.o(collection2, 10));
                        for (m1 m1Var2 : collection2) {
                            boolean z13 = l0Var2.f42717b;
                            m1Var2.getClass();
                            z1 z1Var4 = z13 ? m1Var2.f28566p : m1Var2.f28567q;
                            z1Var4.getClass();
                            arrayList4.add(z1Var4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (z1 z1Var5 : arrayList4) {
                            List<x0> listB2 = z1Var5.b();
                            s0.r0 r0Var = z1Var5.f38494g;
                            for (x0 x0Var : listB2) {
                                l1 l1Var = r0Var.f38439b;
                                s0.g gVar2 = b0.b.f5060i;
                                if (!l1Var.f38383a.containsKey(gVar2) || l1Var.d(gVar2) == null) {
                                    linkedHashMap2.put(x0Var, Long.valueOf(Intrinsics.areEqual(x0Var.f38474j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objD2 = l1Var.d(gVar2);
                                    objD2.getClass();
                                    linkedHashMap2.put(x0Var, objD2);
                                }
                            }
                        }
                        break;
                    case 2:
                        y1 y1Var = new y1();
                        l0 l0Var3 = this.f42713b;
                        for (m1 m1Var3 : l0Var3.f42716a) {
                            boolean z14 = l0Var3.f42717b;
                            m1Var3.getClass();
                            z1 z1Var6 = z14 ? m1Var3.f28566p : m1Var3.f28567q;
                            z1Var6.getClass();
                            y1Var.a(z1Var6);
                        }
                        break;
                    case 3:
                        u70.t tVar = this.f42713b.f42720e;
                        if (!((y1) tVar.getValue()).c()) {
                            h2.b("Check failed.");
                        }
                        break;
                    default:
                        l0 l0Var4 = this.f42713b;
                        u70.t tVar2 = l0Var4.f42721f;
                        if (((y1) l0Var4.f42720e.getValue()).c()) {
                            s0.l lVar = ((z1) tVar2.getValue()).f38489b;
                            if (lVar != null) {
                                ArrayList arrayList5 = new ArrayList();
                                List listB3 = ((z1) tVar2.getValue()).b();
                                listB3.getClass();
                                arrayList5.addAll(listB3);
                                x0 x0Var2 = lVar.f38374a;
                                x0Var2.getClass();
                                arrayList5.add(x0Var2);
                                List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                                if (listUnmodifiableList != null) {
                                }
                            }
                        } else {
                            h2.b("Check failed.");
                        }
                        break;
                }
                return null;
            }
        });
        final int i13 = 2;
        this.f42720e = u70.l.b(new Function0(this) { // from class: w.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f42713b;

            {
                this.f42713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        ArrayList<z1> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        l0 l0Var = this.f42713b;
                        for (m1 m1Var : l0Var.f42716a) {
                            boolean z12 = l0Var.f42717b;
                            m1Var.getClass();
                            z1 z1Var = z12 ? m1Var.f28566p : m1Var.f28567q;
                            z1Var.getClass();
                            arrayList.add(z1Var);
                            o2 o2Var = m1Var.f28560i;
                            o2Var.getClass();
                            arrayList2.add(o2Var);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((z1) it.next()).f38494g.f38440c == 5) {
                                    if (wd.a.B(6, "CXCP")) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
                                    o0Var.getClass();
                                    break;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        s0.g gVar = c0.g.f6802a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                z1 z1Var2 = (z1) it2.next();
                                if (!z1Var2.f38494g.f38439b.f38383a.containsKey(gVar) || z1Var2.b().size() == 1) {
                                    if (z1Var2.f38494g.f38439b.f38383a.containsKey(gVar)) {
                                        int i122 = 0;
                                        for (z1 z1Var3 : arrayList) {
                                            if (((o2) arrayList3.get(i122)).n() == q2.METERING_REPEATING) {
                                                z1Var3.b().getClass();
                                                pd.g.n("MeteringRepeating should contain a surface", !r8.isEmpty());
                                                linkedHashMap.put(z1Var3.b().get(0), 1L);
                                            } else if (z1Var3.f38494g.f38439b.f38383a.containsKey(gVar)) {
                                                List listB = z1Var3.b();
                                                listB.getClass();
                                                if (!listB.isEmpty()) {
                                                    Object obj = z1Var3.b().get(0);
                                                    Object objD = z1Var3.f38494g.f38439b.d(gVar);
                                                    objD.getClass();
                                                    linkedHashMap.put(obj, objD);
                                                }
                                            }
                                            i122++;
                                        }
                                    }
                                } else if (wd.a.B(6, "CXCP")) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + z1Var2.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                }
                            }
                        }
                        if (wd.a.B(3, "CXCP")) {
                            Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        }
                        break;
                    case 1:
                        l0 l0Var2 = this.f42713b;
                        Collection<m1> collection2 = l0Var2.f42716a;
                        ArrayList<z1> arrayList4 = new ArrayList(kotlin.collections.e0.o(collection2, 10));
                        for (m1 m1Var2 : collection2) {
                            boolean z13 = l0Var2.f42717b;
                            m1Var2.getClass();
                            z1 z1Var4 = z13 ? m1Var2.f28566p : m1Var2.f28567q;
                            z1Var4.getClass();
                            arrayList4.add(z1Var4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (z1 z1Var5 : arrayList4) {
                            List<x0> listB2 = z1Var5.b();
                            s0.r0 r0Var = z1Var5.f38494g;
                            for (x0 x0Var : listB2) {
                                l1 l1Var = r0Var.f38439b;
                                s0.g gVar2 = b0.b.f5060i;
                                if (!l1Var.f38383a.containsKey(gVar2) || l1Var.d(gVar2) == null) {
                                    linkedHashMap2.put(x0Var, Long.valueOf(Intrinsics.areEqual(x0Var.f38474j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objD2 = l1Var.d(gVar2);
                                    objD2.getClass();
                                    linkedHashMap2.put(x0Var, objD2);
                                }
                            }
                        }
                        break;
                    case 2:
                        y1 y1Var = new y1();
                        l0 l0Var3 = this.f42713b;
                        for (m1 m1Var3 : l0Var3.f42716a) {
                            boolean z14 = l0Var3.f42717b;
                            m1Var3.getClass();
                            z1 z1Var6 = z14 ? m1Var3.f28566p : m1Var3.f28567q;
                            z1Var6.getClass();
                            y1Var.a(z1Var6);
                        }
                        break;
                    case 3:
                        u70.t tVar = this.f42713b.f42720e;
                        if (!((y1) tVar.getValue()).c()) {
                            h2.b("Check failed.");
                        }
                        break;
                    default:
                        l0 l0Var4 = this.f42713b;
                        u70.t tVar2 = l0Var4.f42721f;
                        if (((y1) l0Var4.f42720e.getValue()).c()) {
                            s0.l lVar = ((z1) tVar2.getValue()).f38489b;
                            if (lVar != null) {
                                ArrayList arrayList5 = new ArrayList();
                                List listB3 = ((z1) tVar2.getValue()).b();
                                listB3.getClass();
                                arrayList5.addAll(listB3);
                                x0 x0Var2 = lVar.f38374a;
                                x0Var2.getClass();
                                arrayList5.add(x0Var2);
                                List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                                if (listUnmodifiableList != null) {
                                }
                            }
                        } else {
                            h2.b("Check failed.");
                        }
                        break;
                }
                return null;
            }
        });
        final int i14 = 3;
        this.f42721f = u70.l.b(new Function0(this) { // from class: w.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f42713b;

            {
                this.f42713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        ArrayList<z1> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        l0 l0Var = this.f42713b;
                        for (m1 m1Var : l0Var.f42716a) {
                            boolean z12 = l0Var.f42717b;
                            m1Var.getClass();
                            z1 z1Var = z12 ? m1Var.f28566p : m1Var.f28567q;
                            z1Var.getClass();
                            arrayList.add(z1Var);
                            o2 o2Var = m1Var.f28560i;
                            o2Var.getClass();
                            arrayList2.add(o2Var);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((z1) it.next()).f38494g.f38440c == 5) {
                                    if (wd.a.B(6, "CXCP")) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
                                    o0Var.getClass();
                                    break;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        s0.g gVar = c0.g.f6802a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                z1 z1Var2 = (z1) it2.next();
                                if (!z1Var2.f38494g.f38439b.f38383a.containsKey(gVar) || z1Var2.b().size() == 1) {
                                    if (z1Var2.f38494g.f38439b.f38383a.containsKey(gVar)) {
                                        int i122 = 0;
                                        for (z1 z1Var3 : arrayList) {
                                            if (((o2) arrayList3.get(i122)).n() == q2.METERING_REPEATING) {
                                                z1Var3.b().getClass();
                                                pd.g.n("MeteringRepeating should contain a surface", !r8.isEmpty());
                                                linkedHashMap.put(z1Var3.b().get(0), 1L);
                                            } else if (z1Var3.f38494g.f38439b.f38383a.containsKey(gVar)) {
                                                List listB = z1Var3.b();
                                                listB.getClass();
                                                if (!listB.isEmpty()) {
                                                    Object obj = z1Var3.b().get(0);
                                                    Object objD = z1Var3.f38494g.f38439b.d(gVar);
                                                    objD.getClass();
                                                    linkedHashMap.put(obj, objD);
                                                }
                                            }
                                            i122++;
                                        }
                                    }
                                } else if (wd.a.B(6, "CXCP")) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + z1Var2.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                }
                            }
                        }
                        if (wd.a.B(3, "CXCP")) {
                            Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        }
                        break;
                    case 1:
                        l0 l0Var2 = this.f42713b;
                        Collection<m1> collection2 = l0Var2.f42716a;
                        ArrayList<z1> arrayList4 = new ArrayList(kotlin.collections.e0.o(collection2, 10));
                        for (m1 m1Var2 : collection2) {
                            boolean z13 = l0Var2.f42717b;
                            m1Var2.getClass();
                            z1 z1Var4 = z13 ? m1Var2.f28566p : m1Var2.f28567q;
                            z1Var4.getClass();
                            arrayList4.add(z1Var4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (z1 z1Var5 : arrayList4) {
                            List<x0> listB2 = z1Var5.b();
                            s0.r0 r0Var = z1Var5.f38494g;
                            for (x0 x0Var : listB2) {
                                l1 l1Var = r0Var.f38439b;
                                s0.g gVar2 = b0.b.f5060i;
                                if (!l1Var.f38383a.containsKey(gVar2) || l1Var.d(gVar2) == null) {
                                    linkedHashMap2.put(x0Var, Long.valueOf(Intrinsics.areEqual(x0Var.f38474j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objD2 = l1Var.d(gVar2);
                                    objD2.getClass();
                                    linkedHashMap2.put(x0Var, objD2);
                                }
                            }
                        }
                        break;
                    case 2:
                        y1 y1Var = new y1();
                        l0 l0Var3 = this.f42713b;
                        for (m1 m1Var3 : l0Var3.f42716a) {
                            boolean z14 = l0Var3.f42717b;
                            m1Var3.getClass();
                            z1 z1Var6 = z14 ? m1Var3.f28566p : m1Var3.f28567q;
                            z1Var6.getClass();
                            y1Var.a(z1Var6);
                        }
                        break;
                    case 3:
                        u70.t tVar = this.f42713b.f42720e;
                        if (!((y1) tVar.getValue()).c()) {
                            h2.b("Check failed.");
                        }
                        break;
                    default:
                        l0 l0Var4 = this.f42713b;
                        u70.t tVar2 = l0Var4.f42721f;
                        if (((y1) l0Var4.f42720e.getValue()).c()) {
                            s0.l lVar = ((z1) tVar2.getValue()).f38489b;
                            if (lVar != null) {
                                ArrayList arrayList5 = new ArrayList();
                                List listB3 = ((z1) tVar2.getValue()).b();
                                listB3.getClass();
                                arrayList5.addAll(listB3);
                                x0 x0Var2 = lVar.f38374a;
                                x0Var2.getClass();
                                arrayList5.add(x0Var2);
                                List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                                if (listUnmodifiableList != null) {
                                }
                            }
                        } else {
                            h2.b("Check failed.");
                        }
                        break;
                }
                return null;
            }
        });
        final int i15 = 4;
        this.f42722g = u70.l.b(new Function0(this) { // from class: w.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f42713b;

            {
                this.f42713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        ArrayList<z1> arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        l0 l0Var = this.f42713b;
                        for (m1 m1Var : l0Var.f42716a) {
                            boolean z12 = l0Var.f42717b;
                            m1Var.getClass();
                            z1 z1Var = z12 ? m1Var.f28566p : m1Var.f28567q;
                            z1Var.getClass();
                            arrayList.add(z1Var);
                            o2 o2Var = m1Var.f28560i;
                            o2Var.getClass();
                            arrayList2.add(o2Var);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((z1) it.next()).f38494g.f38440c == 5) {
                                    if (wd.a.B(6, "CXCP")) {
                                        Log.e("CXCP", "ZSL in populateSurfaceToStreamUseCaseMapping()");
                                    }
                                    kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
                                    o0Var.getClass();
                                    break;
                                }
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        s0.g gVar = c0.g.f6802a;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                z1 z1Var2 = (z1) it2.next();
                                if (!z1Var2.f38494g.f38439b.f38383a.containsKey(gVar) || z1Var2.b().size() == 1) {
                                    if (z1Var2.f38494g.f38439b.f38383a.containsKey(gVar)) {
                                        int i122 = 0;
                                        for (z1 z1Var3 : arrayList) {
                                            if (((o2) arrayList3.get(i122)).n() == q2.METERING_REPEATING) {
                                                z1Var3.b().getClass();
                                                pd.g.n("MeteringRepeating should contain a surface", !r8.isEmpty());
                                                linkedHashMap.put(z1Var3.b().get(0), 1L);
                                            } else if (z1Var3.f38494g.f38439b.f38383a.containsKey(gVar)) {
                                                List listB = z1Var3.b();
                                                listB.getClass();
                                                if (!listB.isEmpty()) {
                                                    Object obj = z1Var3.b().get(0);
                                                    Object objD = z1Var3.f38494g.f38439b.d(gVar);
                                                    objD.getClass();
                                                    linkedHashMap.put(obj, objD);
                                                }
                                            }
                                            i122++;
                                        }
                                    }
                                } else if (wd.a.B(6, "CXCP")) {
                                    Log.e("CXCP", "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + z1Var2.b().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                                }
                            }
                        }
                        if (wd.a.B(3, "CXCP")) {
                            Log.d("CXCP", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + linkedHashMap);
                        }
                        break;
                    case 1:
                        l0 l0Var2 = this.f42713b;
                        Collection<m1> collection2 = l0Var2.f42716a;
                        ArrayList<z1> arrayList4 = new ArrayList(kotlin.collections.e0.o(collection2, 10));
                        for (m1 m1Var2 : collection2) {
                            boolean z13 = l0Var2.f42717b;
                            m1Var2.getClass();
                            z1 z1Var4 = z13 ? m1Var2.f28566p : m1Var2.f28567q;
                            z1Var4.getClass();
                            arrayList4.add(z1Var4);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (z1 z1Var5 : arrayList4) {
                            List<x0> listB2 = z1Var5.b();
                            s0.r0 r0Var = z1Var5.f38494g;
                            for (x0 x0Var : listB2) {
                                l1 l1Var = r0Var.f38439b;
                                s0.g gVar2 = b0.b.f5060i;
                                if (!l1Var.f38383a.containsKey(gVar2) || l1Var.d(gVar2) == null) {
                                    linkedHashMap2.put(x0Var, Long.valueOf(Intrinsics.areEqual(x0Var.f38474j, MediaCodec.class) ? 1L : 0L));
                                } else {
                                    Object objD2 = l1Var.d(gVar2);
                                    objD2.getClass();
                                    linkedHashMap2.put(x0Var, objD2);
                                }
                            }
                        }
                        break;
                    case 2:
                        y1 y1Var = new y1();
                        l0 l0Var3 = this.f42713b;
                        for (m1 m1Var3 : l0Var3.f42716a) {
                            boolean z14 = l0Var3.f42717b;
                            m1Var3.getClass();
                            z1 z1Var6 = z14 ? m1Var3.f28566p : m1Var3.f28567q;
                            z1Var6.getClass();
                            y1Var.a(z1Var6);
                        }
                        break;
                    case 3:
                        u70.t tVar = this.f42713b.f42720e;
                        if (!((y1) tVar.getValue()).c()) {
                            h2.b("Check failed.");
                        }
                        break;
                    default:
                        l0 l0Var4 = this.f42713b;
                        u70.t tVar2 = l0Var4.f42721f;
                        if (((y1) l0Var4.f42720e.getValue()).c()) {
                            s0.l lVar = ((z1) tVar2.getValue()).f38489b;
                            if (lVar != null) {
                                ArrayList arrayList5 = new ArrayList();
                                List listB3 = ((z1) tVar2.getValue()).b();
                                listB3.getClass();
                                arrayList5.addAll(listB3);
                                x0 x0Var2 = lVar.f38374a;
                                x0Var2.getClass();
                                arrayList5.add(x0Var2);
                                List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                                if (listUnmodifiableList != null) {
                                }
                            }
                        } else {
                            h2.b("Check failed.");
                        }
                        break;
                }
                return null;
            }
        });
    }

    public final void a(x0 x0Var) {
        x70.c cVar;
        Object next;
        x0Var.getClass();
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "Unavailable " + x0Var + ", notify SessionConfig invalid");
        }
        Iterator it = this.f42716a.iterator();
        while (true) {
            cVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            m1 m1Var = (m1) next;
            m1Var.getClass();
            z1 z1Var = this.f42717b ? m1Var.f28566p : m1Var.f28567q;
            z1Var.getClass();
            if (z1Var.b().contains(x0Var)) {
                break;
            }
        }
        m1 m1Var2 = (m1) next;
        z1 z1Var2 = m1Var2 != null ? m1Var2.f28566p : null;
        c90.f fVar = v80.p0.f42144a;
        v80.f0.B(v80.f0.b(a90.p.f1044a.f43295e), null, null, new a3.y(z1Var2, cVar, 29), 3);
    }
}
