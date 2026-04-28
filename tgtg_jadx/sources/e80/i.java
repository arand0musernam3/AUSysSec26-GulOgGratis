package e80;

import java.io.File;
import java.util.Iterator;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f15863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileWalkDirection f15864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f15865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f15866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function2 f15867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15868f;

    public i(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        fileWalkDirection = (i12 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection;
        i11 = (i12 & 32) != 0 ? Integer.MAX_VALUE : i11;
        this.f15863a = file;
        this.f15864b = fileWalkDirection;
        this.f15865c = function1;
        this.f15866d = function12;
        this.f15867e = function2;
        this.f15868f = i11;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new g(this);
    }
}
