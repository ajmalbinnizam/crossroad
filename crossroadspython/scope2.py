def check_scope():
    def do_local():
        test = "local_test"

    def do_non_local():
        nonlocal test
        test = "nonlocal"

    def do_global():
        global test
        test = "global"

    test = "default"
    do_local()
    print('test value after do local: ' + test)
    do_non_local()
    print('test value after nonlocal: ' + test)
    do_global()
    print('test value after global: ' + test)

check_scope()
print('test value after do local: ' + test)


