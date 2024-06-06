package bucketshort;

public class Theory {
    //Uses hashing
    //Makes assumptions about the data, like radix and counting sort
    //Because it makes assumptions, can sort in O(n) time
    //Performs best when hashed values of items being sorted are evenly distributed, so there aren't many collisions

    //Distribute the items into buckets based on their hashed values (scattering phase)
    //Soft the items in each bucket
    //Merge the buckets - can just concatenate them (gathering phase)

    //A generalization of counting sort

    //The values in bucket X must be greater than the values in bucket X-1 and less than the values
    //in bucket X+1.

    //This means that the hash function we use must meet this requirement
}
