package androidx.compose.runtime.tooling;

import a4.a;
import a4.d;
import a4.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.collections.d1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/tooling/DiagnosticComposeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDiagnosticComposeException.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiagnosticComposeException.jvm.kt\nandroidx/compose/runtime/tooling/DiagnosticComposeException\n*L\n1#1,54:1\n52#1:55\n*S KotlinDebug\n*F\n+ 1 DiagnosticComposeException.jvm.kt\nandroidx/compose/runtime/tooling/DiagnosticComposeException\n*L\n29#1:55\n*E\n"})
public final class DiagnosticComposeException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f2252a;

    public DiagnosticComposeException(a aVar) {
        this.f2252a = aVar;
        if (aVar.a()) {
            return;
        }
        ArrayList arrayListA = e.a(aVar);
        int size = arrayListA.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
        for (int i11 = 0; i11 < size; i11++) {
            stackTraceElementArr[i11] = new StackTraceElement("$$compose", "m$" + ((d) arrayListA.get(i11)).f682a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        a aVar = this.f2252a;
        if (!aVar.a()) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb2 = new StringBuilder("Composition stack when thrown:\n");
        int i11 = 0;
        if (aVar.a()) {
            v70.e eVarB = c0.b();
            List list = aVar.f680a;
            list.getClass();
            d1 d1Var = new d1(list);
            int iB = d1Var.b();
            for (int i12 = 0; i12 < iB; i12++) {
                ((d) d1Var.get(i12)).getClass();
            }
            v70.e eVarA = c0.a(eVarB);
            eVarA.getClass();
            d1 d1Var2 = new d1(eVarA);
            int iB2 = d1Var2.b();
            while (i11 < iB2) {
                String str = (String) d1Var2.get(i11);
                sb2.append("\tat ");
                sb2.append(str);
                sb2.append('\n');
                i11++;
            }
        } else {
            ArrayList arrayListA = e.a(aVar);
            int size = arrayListA.size();
            while (i11 < size) {
                d dVar = (d) arrayListA.get(i11);
                sb2.append("\tat $$compose.m$");
                sb2.append(dVar.f682a);
                sb2.append("(SourceFile:1)\n");
                i11++;
            }
        }
        return sb2.toString();
    }
}
